package com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001:\u0013\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter;", "", "<init>", "()V", "Data", "External", com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OPERATION_NAME, "OnExternalAuthorizeBillingAgreementCreationSuccessResponse", "Contingency", "OnExternalAddCardContingency", "OnExternalUpdateCardContingency", "OnExternalAuthChallengeContingency", "OnExternalEConsentContingency", "OnExternalThreeDsContingency", "OnExternalReselectFundingInstrumentContingency", "OnExternalUnknownContingency", "OnExternalCitAuthContingency", "OnExternalPreAuthorizationDeclinedContingency", "OnExternalUserConsentForBankAccountInfoContingency", "OnExternalBankAccountBalanceRequiredContingency", "StaleDomain", "OnExternalAuthorizeBillingAgreementCreationErrorResponse", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthorizeBillingAgreementCreationMutation_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Data> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL);
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External external = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                external = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.External.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Data(external);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.External.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getExternal());
        }
    }

    private AuthorizeBillingAgreementCreationMutation_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$External;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$External;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$External;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$External;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class External implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.External INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.External();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("authorizeBillingAgreementCreation");
        public static final int $stable = 8;

        private External() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation authorizeBillingAgreementCreation = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                authorizeBillingAgreementCreation = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.AuthorizeBillingAgreementCreation.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External(authorizeBillingAgreementCreation);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.External value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("authorizeBillingAgreementCreation");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.AuthorizeBillingAgreementCreation.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getAuthorizeBillingAgreementCreation());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$AuthorizeBillingAgreementCreation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$AuthorizeBillingAgreementCreation;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$AuthorizeBillingAgreementCreation;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$AuthorizeBillingAgreementCreation;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthorizeBillingAgreementCreation implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.AuthorizeBillingAgreementCreation INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.AuthorizeBillingAgreementCreation();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AuthorizeBillingAgreementCreation() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationSuccessResponse onExternalAuthorizeBillingAgreementCreationSuccessResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationErrorResponse onExternalAuthorizeBillingAgreementCreationErrorResponse = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalAuthorizeBillingAgreementCreationSuccessResponse"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalAuthorizeBillingAgreementCreationSuccessResponse = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationSuccessResponse.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalAuthorizeBillingAgreementCreationSuccessResponse = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalAuthorizeBillingAgreementCreationErrorResponse"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalAuthorizeBillingAgreementCreationErrorResponse = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationErrorResponse.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation(str, onExternalAuthorizeBillingAgreementCreationSuccessResponse, onExternalAuthorizeBillingAgreementCreationErrorResponse);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.AuthorizeBillingAgreementCreation value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalAuthorizeBillingAgreementCreationSuccessResponse() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationSuccessResponse.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalAuthorizeBillingAgreementCreationSuccessResponse());
            }
            if (value.getOnExternalAuthorizeBillingAgreementCreationErrorResponse() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationErrorResponse.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalAuthorizeBillingAgreementCreationErrorResponse());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalAuthorizeBillingAgreementCreationSuccessResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthorizeBillingAgreementCreationSuccessResponse;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthorizeBillingAgreementCreationSuccessResponse;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthorizeBillingAgreementCreationSuccessResponse;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalAuthorizeBillingAgreementCreationSuccessResponse implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationSuccessResponse> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationSuccessResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationSuccessResponse();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"returnURL", "merchantName", "status", "intent", "paymentID", "payerID", "contingencies", "staleDomains"});
        public static final int $stable = 8;

        private OnExternalAuthorizeBillingAgreementCreationSuccessResponse() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0089, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "staleDomains");
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0093, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0094, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "contingencies");
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x009e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r8 == null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r9 == null) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
        
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationSuccessResponse(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationSuccessResponse fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            java.lang.String str3 = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            java.util.List list = null;
            java.util.List list2 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Contingency.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.StaleDomain.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationSuccessResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("returnURL");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getReturnURL());
            writer.name("merchantName");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getMerchantName());
            writer.name("status");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getStatus());
            writer.name("intent");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIntent());
            writer.name("paymentID");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPaymentID());
            writer.name("payerID");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPayerID());
            writer.name("contingencies");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Contingency.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getContingencies());
            writer.name("staleDomains");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.StaleDomain.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getStaleDomains());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$Contingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Contingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Contingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Contingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Contingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Contingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Contingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Contingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAddCardContingency onExternalAddCardContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUpdateCardContingency onExternalUpdateCardContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthChallengeContingency onExternalAuthChallengeContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalEConsentContingency onExternalEConsentContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalThreeDsContingency onExternalThreeDsContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalReselectFundingInstrumentContingency onExternalReselectFundingInstrumentContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUnknownContingency onExternalUnknownContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalCitAuthContingency onExternalCitAuthContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalPreAuthorizationDeclinedContingency onExternalPreAuthorizationDeclinedContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUserConsentForBankAccountInfoContingency onExternalUserConsentForBankAccountInfoContingency;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalBankAccountBalanceRequiredContingency onExternalBankAccountBalanceRequiredContingency = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalAddCardContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalAddCardContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAddCardContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalAddCardContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUpdateCardContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUpdateCardContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUpdateCardContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalUpdateCardContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalAuthChallengeContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalAuthChallengeContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthChallengeContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalAuthChallengeContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalEConsentContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalEConsentContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalEConsentContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalEConsentContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalThreeDsContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalThreeDsContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalThreeDsContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalThreeDsContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalReselectFundingInstrumentContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalReselectFundingInstrumentContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalReselectFundingInstrumentContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalReselectFundingInstrumentContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUnknownContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUnknownContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUnknownContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalUnknownContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalCitAuthContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalCitAuthContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalCitAuthContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalCitAuthContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPreAuthorizationDeclinedContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalPreAuthorizationDeclinedContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalPreAuthorizationDeclinedContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalPreAuthorizationDeclinedContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUserConsentForBankAccountInfoContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUserConsentForBankAccountInfoContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalUserConsentForBankAccountInfoContingency = null;
            }
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUserConsentForBankAccountInfoContingency onExternalUserConsentForBankAccountInfoContingency2 = onExternalUserConsentForBankAccountInfoContingency;
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBankAccountBalanceRequiredContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalBankAccountBalanceRequiredContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency(str, onExternalAddCardContingency, onExternalUpdateCardContingency, onExternalAuthChallengeContingency, onExternalEConsentContingency, onExternalThreeDsContingency, onExternalReselectFundingInstrumentContingency, onExternalUnknownContingency, onExternalCitAuthContingency, onExternalPreAuthorizationDeclinedContingency, onExternalUserConsentForBankAccountInfoContingency2, onExternalBankAccountBalanceRequiredContingency);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Contingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalAddCardContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAddCardContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalAddCardContingency());
            }
            if (value.getOnExternalUpdateCardContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUpdateCardContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUpdateCardContingency());
            }
            if (value.getOnExternalAuthChallengeContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthChallengeContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalAuthChallengeContingency());
            }
            if (value.getOnExternalEConsentContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalEConsentContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalEConsentContingency());
            }
            if (value.getOnExternalThreeDsContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalThreeDsContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalThreeDsContingency());
            }
            if (value.getOnExternalReselectFundingInstrumentContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalReselectFundingInstrumentContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalReselectFundingInstrumentContingency());
            }
            if (value.getOnExternalUnknownContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUnknownContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUnknownContingency());
            }
            if (value.getOnExternalCitAuthContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalCitAuthContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalCitAuthContingency());
            }
            if (value.getOnExternalPreAuthorizationDeclinedContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalPreAuthorizationDeclinedContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalPreAuthorizationDeclinedContingency());
            }
            if (value.getOnExternalUserConsentForBankAccountInfoContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUserConsentForBankAccountInfoContingency());
            }
            if (value.getOnExternalBankAccountBalanceRequiredContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBankAccountBalanceRequiredContingency());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalAddCardContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAddCardContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAddCardContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAddCardContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalAddCardContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAddCardContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAddCardContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAddCardContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalAddCardContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAddCardContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAddCardContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAddCardContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalUpdateCardContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUpdateCardContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUpdateCardContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUpdateCardContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUpdateCardContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUpdateCardContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUpdateCardContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUpdateCardContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalUpdateCardContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUpdateCardContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUpdateCardContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUpdateCardContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalAuthChallengeContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthChallengeContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthChallengeContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthChallengeContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalAuthChallengeContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthChallengeContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthChallengeContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthChallengeContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "stepUpAuthID"});
        public static final int $stable = 8;

        private OnExternalAuthChallengeContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthChallengeContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalContingencyName == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthChallengeContingency(externalContingencyName, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "stepUpAuthID");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthChallengeContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("stepUpAuthID");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getStepUpAuthID());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalEConsentContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalEConsentContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalEConsentContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalEConsentContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalEConsentContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalEConsentContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalEConsentContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalEConsentContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalEConsentContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalEConsentContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalEConsentContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalEConsentContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalThreeDsContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalThreeDsContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalThreeDsContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalThreeDsContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalThreeDsContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalThreeDsContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalThreeDsContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalThreeDsContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "id"});
        public static final int $stable = 8;

        private OnExternalThreeDsContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalThreeDsContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalContingencyName == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalThreeDsContingency(externalContingencyName, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalThreeDsContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalReselectFundingInstrumentContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalReselectFundingInstrumentContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalReselectFundingInstrumentContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalReselectFundingInstrumentContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalReselectFundingInstrumentContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalReselectFundingInstrumentContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalReselectFundingInstrumentContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalReselectFundingInstrumentContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "reason"});
        public static final int $stable = 8;

        private OnExternalReselectFundingInstrumentContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalReselectFundingInstrumentContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentContingencyReason externalFundingInstrumentContingencyReason = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    externalFundingInstrumentContingencyReason = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentContingencyReason) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentContingencyReason_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                }
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalReselectFundingInstrumentContingency(externalContingencyName, externalFundingInstrumentContingencyReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalReselectFundingInstrumentContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("reason");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentContingencyReason_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getReason());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalUnknownContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUnknownContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUnknownContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUnknownContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUnknownContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUnknownContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUnknownContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUnknownContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "downstreamContingencyType"});
        public static final int $stable = 8;

        private OnExternalUnknownContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUnknownContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalContingencyName == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUnknownContingency(externalContingencyName, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "downstreamContingencyType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUnknownContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("downstreamContingencyType");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDownstreamContingencyType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalCitAuthContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalCitAuthContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalCitAuthContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalCitAuthContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalCitAuthContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalCitAuthContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalCitAuthContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalCitAuthContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalCitAuthContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalCitAuthContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalCitAuthContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalCitAuthContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalPreAuthorizationDeclinedContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalPreAuthorizationDeclinedContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalPreAuthorizationDeclinedContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalPreAuthorizationDeclinedContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalPreAuthorizationDeclinedContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalPreAuthorizationDeclinedContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalPreAuthorizationDeclinedContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalPreAuthorizationDeclinedContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "id"});
        public static final int $stable = 8;

        private OnExternalPreAuthorizationDeclinedContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalPreAuthorizationDeclinedContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalContingencyName == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalPreAuthorizationDeclinedContingency(externalContingencyName, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "id");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalPreAuthorizationDeclinedContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalUserConsentForBankAccountInfoContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUserConsentForBankAccountInfoContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUserConsentForBankAccountInfoContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalUserConsentForBankAccountInfoContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUserConsentForBankAccountInfoContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUserConsentForBankAccountInfoContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnExternalUserConsentForBankAccountInfoContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUserConsentForBankAccountInfoContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUserConsentForBankAccountInfoContingency(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalUserConsentForBankAccountInfoContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalBankAccountBalanceRequiredContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalBankAccountBalanceRequiredContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalBankAccountBalanceRequiredContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalBankAccountBalanceRequiredContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBankAccountBalanceRequiredContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalBankAccountBalanceRequiredContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnExternalBankAccountBalanceRequiredContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalBankAccountBalanceRequiredContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalBankAccountBalanceRequiredContingency(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalBankAccountBalanceRequiredContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$StaleDomain;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$StaleDomain;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$StaleDomain;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$StaleDomain;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StaleDomain implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.StaleDomain> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.StaleDomain INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.StaleDomain();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("domain");
        public static final int $stable = 8;

        private StaleDomain() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.StaleDomain fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalDomain = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalDomain_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalDomain != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.StaleDomain(externalDomain);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "domain");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.StaleDomain value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("domain");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalDomain_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getDomain());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$OnExternalAuthorizeBillingAgreementCreationErrorResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthorizeBillingAgreementCreationErrorResponse;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthorizeBillingAgreementCreationErrorResponse;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$OnExternalAuthorizeBillingAgreementCreationErrorResponse;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalAuthorizeBillingAgreementCreationErrorResponse implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationErrorResponse> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationErrorResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.OnExternalAuthorizeBillingAgreementCreationErrorResponse();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
        public static final int $stable = 8;

        private OnExternalAuthorizeBillingAgreementCreationErrorResponse() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationErrorResponse fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Error.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationErrorResponse(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.OnExternalAuthorizeBillingAgreementCreationErrorResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Error.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getErrors());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/AuthorizeBillingAgreementCreationMutation_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Error;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Error;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/AuthorizeBillingAgreementCreationMutation$Error;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Error implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Error INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.AuthorizeBillingAgreementCreationMutation_ResponseAdapter.Error();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private Error() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalAuthorizeBillingAgreementCreationErrorReason externalAuthorizeBillingAgreementCreationErrorReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalAuthorizeBillingAgreementCreationErrorReason = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalAuthorizeBillingAgreementCreationErrorReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalAuthorizeBillingAgreementCreationErrorReason != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error(externalAuthorizeBillingAgreementCreationErrorReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.AuthorizeBillingAgreementCreationMutation.Error value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalAuthorizeBillingAgreementCreationErrorReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }
}
