package com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b7\bÆ\u0002\u0018\u00002\u00020\u0001:5\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345678B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter;", "", "<init>", "()V", "Data", "External", com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OPERATION_NAME, "OnExternalFundingSelectionSuccessResponse", "FundingInstrument", "OnExternalFundingInstrument", "ImageUrl", "CurrencyConversionOption", "OnExternalCurrencyConversionPayPal", "ConversionRate", "ConvertedAmount", "OnExternalCurrencyConversionVendor", "Usability", "OnExternalFundingUsability", "OnExternalFundingDisallowed", "InstrumentationLevelContingency", "OnExternalContingency", "OnExternalPreAuthorizationRequiredContingency", "AuthorizedAmount", "OnExternalThreeDsContingency", "OnExternalUserConsentForBankAccountInfoContingency", "OnExternalBankAccountBalanceRequiredContingency", "OnExternalUnknownContingency", "OnExternalBalanceFundingInstrument", "AvailableAmount", "OnExternalBankFundingInstrument", "OnExternalCardFundingInstrument", "OnExternalPayPalCreditFundingInstrument", "CreditOffer", "CreditAmount", "OnExternalPayPalRewardsFundingInstrument", "RewardsBalance", "TargetCurrencyAmount", "Config", "InstrumentConstraint", "OnExternalBankFundingInstrumentDisallowed", "DisallowedAccountType", "OnExternalCardFundingInstrumentDisallowed", "DisallowedSubType", "DisallowedBrand", "TransactionLevelContingency", "OnExternalAddCardContingency", "OnExternalUpdateCardContingency", "OnExternalContingency1", "OnExternalAuthChallengeContingency", "OnExternalUnknownContingency1", com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsTestTag.DISCLAIMER, "CreditOffer1", "CreditAmount1", "ImageUrl1", "StaleDomain", "OnExternalFundingSelectionErrorResponse", "Error"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FundingSelectionQuery_ResponseAdapter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter();

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Data;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Data;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Data;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Data implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Data> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Data INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Data();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL);
        public static final int $stable = 8;

        private Data() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Data fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External external = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                external = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.External.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Data(external);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Data value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.External.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getExternal());
        }
    }

    private FundingSelectionQuery_ResponseAdapter() {
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$External;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$External;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$External;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$External;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class External implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.External INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.External();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("fundingSelection");
        public static final int $stable = 8;

        private External() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection fundingSelection = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                fundingSelection = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingSelection.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External(fundingSelection);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.External value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fundingSelection");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingSelection.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getFundingSelection());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$FundingSelection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingSelection;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingSelection;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingSelection;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingSelection implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingSelection INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingSelection();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FundingSelection() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse onExternalFundingSelectionSuccessResponse;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionErrorResponse onExternalFundingSelectionErrorResponse = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalFundingSelectionSuccessResponse"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalFundingSelectionSuccessResponse = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionSuccessResponse.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalFundingSelectionSuccessResponse = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalFundingSelectionErrorResponse"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalFundingSelectionErrorResponse = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionErrorResponse.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection(str, onExternalFundingSelectionSuccessResponse, onExternalFundingSelectionErrorResponse);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingSelection value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalFundingSelectionSuccessResponse() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionSuccessResponse.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalFundingSelectionSuccessResponse());
            }
            if (value.getOnExternalFundingSelectionErrorResponse() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionErrorResponse.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalFundingSelectionErrorResponse());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalFundingSelectionSuccessResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingSelectionSuccessResponse;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingSelectionSuccessResponse;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingSelectionSuccessResponse;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalFundingSelectionSuccessResponse implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionSuccessResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionSuccessResponse();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fundingInstruments", "config", "TransactionLevelContingencies", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.DISCLAIMER, "creditOffers", "staleDomains"});
        public static final int $stable = 8;

        private OnExternalFundingSelectionSuccessResponse() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config config = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Disclaimer disclaimer = null;
            java.util.List list3 = null;
            java.util.List list4 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingInstrument.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    config = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Config.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TransactionLevelContingency.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 3) {
                    disclaimer = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Disclaimer) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Disclaimer.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else if (selectName == 4) {
                    list3 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer1.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 5) {
                        break;
                    }
                    list4 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.StaleDomain.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (list == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "fundingInstruments");
                throw new kotlin.KotlinNothingValueException();
            }
            if (config == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "config");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "TransactionLevelContingencies");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list3 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "creditOffers");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list4 != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse(list, config, list2, disclaimer, list3, list4);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "staleDomains");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionSuccessResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fundingInstruments");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingInstrument.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getFundingInstruments());
            writer.name("config");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Config.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getConfig());
            writer.name("TransactionLevelContingencies");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TransactionLevelContingency.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getTransactionLevelContingencies());
            writer.name(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.DISCLAIMER);
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Disclaimer.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, value.getDisclaimer());
            writer.name("creditOffers");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer1.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getCreditOffers());
            writer.name("staleDomains");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.StaleDomain.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getStaleDomains());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$FundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$FundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class FundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.FundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private FundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingInstrument fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingInstrument.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingInstrument(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.FundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingInstrument.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalFundingInstrument());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "canSplitWith", "id", "imageUrl", "label", "type", "currencyConversionOptions", "usability", "InstrumentationLevelContingencies"});
        public static final int $stable = 8;

        private OnExternalFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x00d0, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBankFundingInstrument"), r21.falseVariables, r4, r21.deferredFragmentIdentifiers, null) == false) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x00d2, code lost:
        
            r20.rewind();
            r14 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrument.INSTANCE.fromJson(r20, r21);
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x00de, code lost:
        
            r16 = r14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00f2, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalCardFundingInstrument"), r21.falseVariables, r4, r21.deferredFragmentIdentifiers, null) == false) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00f4, code lost:
        
            r20.rewind();
            r15 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrument.INSTANCE.fromJson(r20, r21);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0100, code lost:
        
            r17 = r15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0114, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPayPalCreditFundingInstrument"), r21.falseVariables, r4, r21.deferredFragmentIdentifiers, null) == false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0116, code lost:
        
            r20.rewind();
            r18 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalCreditFundingInstrument.INSTANCE.fromJson(r20, r21);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0136, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPayPalRewardsFundingInstrument"), r21.falseVariables, r4, r21.deferredFragmentIdentifiers, null) == false) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0138, code lost:
        
            r20.rewind();
            r2 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalRewardsFundingInstrument.INSTANCE.fromJson(r20, r21);
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0141, code lost:
        
            if (r5 == null) goto L58;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0143, code lost:
        
            if (r6 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0145, code lost:
        
            if (r7 == null) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0147, code lost:
        
            if (r8 == null) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0149, code lost:
        
            if (r9 == null) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x014b, code lost:
        
            if (r10 == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x014d, code lost:
        
            if (r11 == null) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x014f, code lost:
        
            if (r12 == null) goto L44;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x015f, code lost:
        
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingInstrument(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r16, r17, r18, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0160, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "InstrumentationLevelContingencies");
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x016a, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x016b, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "usability");
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0175, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0176, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "currencyConversionOptions");
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x0180, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0181, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x018b, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x018c, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "label");
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0196, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0197, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "imageUrl");
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x01a1, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x01a2, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x01ac, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x01ad, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r20, "canSplitWith");
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x01b7, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0122, code lost:
        
            r18 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ff, code lost:
        
            r15 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        
            r14 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00bd, code lost:
        
            r13 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x01c3, code lost:
        
            throw new java.lang.IllegalStateException("__typename was not found".toString());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0020, code lost:
        
            if (r4 == null) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0034, code lost:
        
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBalanceFundingInstrument"), r21.falseVariables, r4, r21.deferredFragmentIdentifiers, null) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
        
            r20.rewind();
            r13 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBalanceFundingInstrument.INSTANCE.fromJson(r20, r21);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalRewardsFundingInstrument onExternalPayPalRewardsFundingInstrument = null;
            java.lang.String str = null;
            java.util.List list = null;
            java.lang.String str2 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl imageUrl = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType = null;
            java.util.List list2 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Usability usability = null;
            java.util.List list3 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        imageUrl = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        externalFundingInstrumentType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CurrencyConversionOption.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        usability = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Usability) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Usability.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        list3 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentationLevelContingency.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("canSplitWith");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getCanSplitWith());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("imageUrl");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getImageUrl());
            writer.name("label");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLabel());
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("currencyConversionOptions");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CurrencyConversionOption.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getCurrencyConversionOptions());
            writer.name("usability");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Usability.INSTANCE, true).toJson(writer, customScalarAdapters, value.getUsability());
            writer.name("InstrumentationLevelContingencies");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentationLevelContingency.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getInstrumentationLevelContingencies());
            if (value.getOnExternalBalanceFundingInstrument() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBalanceFundingInstrument.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBalanceFundingInstrument());
            }
            if (value.getOnExternalBankFundingInstrument() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrument.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBankFundingInstrument());
            }
            if (value.getOnExternalCardFundingInstrument() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrument.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalCardFundingInstrument());
            }
            if (value.getOnExternalPayPalCreditFundingInstrument() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalCreditFundingInstrument.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalPayPalCreditFundingInstrument());
            }
            if (value.getOnExternalPayPalRewardsFundingInstrument() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalRewardsFundingInstrument.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalPayPalRewardsFundingInstrument());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$ImageUrl;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ImageUrl;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ImageUrl;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ImageUrl;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ImageUrl implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("imagePath");
        public static final int $stable = 8;

        private ImageUrl() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("imagePath");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getImagePath());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$CurrencyConversionOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CurrencyConversionOption;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CurrencyConversionOption;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CurrencyConversionOption;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CurrencyConversionOption implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CurrencyConversionOption> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CurrencyConversionOption INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CurrencyConversionOption();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CurrencyConversionOption() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CurrencyConversionOption fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionPayPal onExternalCurrencyConversionPayPal;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionVendor onExternalCurrencyConversionVendor = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalCurrencyConversionPayPal"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalCurrencyConversionPayPal = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionPayPal.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalCurrencyConversionPayPal = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalCurrencyConversionVendor"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalCurrencyConversionVendor = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionVendor.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CurrencyConversionOption(str, onExternalCurrencyConversionPayPal, onExternalCurrencyConversionVendor);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CurrencyConversionOption value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalCurrencyConversionPayPal() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionPayPal.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalCurrencyConversionPayPal());
            }
            if (value.getOnExternalCurrencyConversionVendor() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionVendor.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalCurrencyConversionVendor());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalCurrencyConversionPayPal;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCurrencyConversionPayPal;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCurrencyConversionPayPal;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCurrencyConversionPayPal;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalCurrencyConversionPayPal implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionPayPal> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionPayPal INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionPayPal();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"type", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE, "convertedAmount", "conversionRateDurationWarning"});
        public static final int $stable = 8;

        private OnExternalCurrencyConversionPayPal() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionPayPal fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCurrencyConversionType externalCurrencyConversionType = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConversionRate conversionRate = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConvertedAmount convertedAmount = null;
            java.lang.Boolean bool = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalCurrencyConversionType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCurrencyConversionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    conversionRate = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConversionRate) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConversionRate.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    convertedAmount = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConvertedAmount) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConvertedAmount.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalCurrencyConversionType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            if (conversionRate == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (convertedAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "convertedAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionPayPal(externalCurrencyConversionType, conversionRate, convertedAmount, bool.booleanValue());
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "conversionRateDurationWarning");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionPayPal value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCurrencyConversionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CONVERSION_RATE);
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConversionRate.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getConversionRate());
            writer.name("convertedAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConvertedAmount.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getConvertedAmount());
            writer.name("conversionRateDurationWarning");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getConversionRateDurationWarning()));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$ConversionRate;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ConversionRate;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ConversionRate;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ConversionRate;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConversionRate implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConversionRate> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConversionRate INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConversionRate();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"fromAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM, "toAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO});
        public static final int $stable = 8;

        private ConversionRate() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConversionRate fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            java.lang.String str2 = null;
            java.lang.Object obj2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    obj2 = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "fromAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM);
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "toAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj2 != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConversionRate(str, obj, str2, obj2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConversionRate value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("fromAmount");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getFromAmount());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_FROM);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getFromCurrency());
            writer.name("toAmount");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getToAmount());
            writer.name(com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.CURRENCY_TO);
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getToCurrency());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$ConvertedAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ConvertedAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ConvertedAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ConvertedAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ConvertedAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConvertedAmount> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConvertedAmount INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ConvertedAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"currencyCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE});
        public static final int $stable = 8;

        private ConvertedAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConvertedAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (obj == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConvertedAmount(obj, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ConvertedAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalCurrencyConversionVendor;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCurrencyConversionVendor;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCurrencyConversionVendor;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCurrencyConversionVendor;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalCurrencyConversionVendor implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionVendor> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionVendor INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCurrencyConversionVendor();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("type");
        public static final int $stable = 8;

        private OnExternalCurrencyConversionVendor() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionVendor fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCurrencyConversionType externalCurrencyConversionType = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalCurrencyConversionType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCurrencyConversionType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalCurrencyConversionType != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionVendor(externalCurrencyConversionType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCurrencyConversionVendor value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCurrencyConversionType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$Usability;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Usability;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Usability;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Usability;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Usability implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Usability> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Usability INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Usability();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private Usability() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Usability fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingUsability fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingUsability.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Usability(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Usability value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingUsability.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalFundingUsability());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalFundingUsability;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingUsability;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingUsability;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingUsability;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalFundingUsability implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingUsability> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingUsability INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingUsability();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"__typename", "status"});
        public static final int $stable = 8;

        private OnExternalFundingUsability() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingUsability fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingDisallowed onExternalFundingDisallowed = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentStatus externalFundingInstrumentStatus = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    externalFundingInstrumentStatus = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentStatus_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalFundingDisallowed"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalFundingDisallowed = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingDisallowed.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalFundingInstrumentStatus != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingUsability(str, externalFundingInstrumentStatus, onExternalFundingDisallowed);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "status");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingUsability value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            writer.name("status");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentStatus_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getStatus());
            if (value.getOnExternalFundingDisallowed() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingDisallowed.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalFundingDisallowed());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalFundingDisallowed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingDisallowed;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingDisallowed;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingDisallowed;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalFundingDisallowed implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingDisallowed> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingDisallowed INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingDisallowed();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private OnExternalFundingDisallowed() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingDisallowed fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFields fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFieldsImpl_ResponseAdapter.DisallowedFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingDisallowed(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingDisallowed value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.DisallowedFieldsImpl_ResponseAdapter.DisallowedFields.INSTANCE.toJson(writer, customScalarAdapters, value.getDisallowedFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$InstrumentationLevelContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentationLevelContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentationLevelContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentationLevelContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstrumentationLevelContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentationLevelContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentationLevelContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InstrumentationLevelContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency onExternalContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPreAuthorizationRequiredContingency onExternalPreAuthorizationRequiredContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalThreeDsContingency onExternalThreeDsContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUserConsentForBankAccountInfoContingency onExternalUserConsentForBankAccountInfoContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankAccountBalanceRequiredContingency onExternalBankAccountBalanceRequiredContingency;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency onExternalUnknownContingency = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPhoneNumberRequiredContingency", "externalEConsentContingency", "externalCardVerificationValueContingency", "externalThreeDsContingency", "externalUserConsentForBankAccountInfoContingency", "externalBankAccountBalanceRequiredContingency", "externalPreAuthorizationRequiredContingency", "externalDataCollectionContingency", "externalUnknownContingency", "externalPreAuthorizationRequiredDeclinedRetryableContingency", "externalSepaContingency", "externalCardExpiringSoonContingency", "externalAddCardContingency", "externalUpdateCardContingency", "externalAuthChallengeContingency", "externalNegativeBalanceRecoveryContingency", "externalStrongCustomerAuthContingency", "externalDomesticShippingContingency", "externalShippingAddressRequiredContingency", "externalShippingAddressInvalidContingency", "externalReselectFundingInstrumentContingency", "externalCitAuthContingency", "externalPreAuthorizationDeclinedContingency", "externalInventorySoldoutContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPreAuthorizationRequiredContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalPreAuthorizationRequiredContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPreAuthorizationRequiredContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalPreAuthorizationRequiredContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalThreeDsContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalThreeDsContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalThreeDsContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalThreeDsContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUserConsentForBankAccountInfoContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUserConsentForBankAccountInfoContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalUserConsentForBankAccountInfoContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBankAccountBalanceRequiredContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalBankAccountBalanceRequiredContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalBankAccountBalanceRequiredContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUnknownContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUnknownContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency(str, onExternalContingency, onExternalPreAuthorizationRequiredContingency, onExternalThreeDsContingency, onExternalUserConsentForBankAccountInfoContingency, onExternalBankAccountBalanceRequiredContingency, onExternalUnknownContingency);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentationLevelContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalContingency());
            }
            if (value.getOnExternalPreAuthorizationRequiredContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPreAuthorizationRequiredContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalPreAuthorizationRequiredContingency());
            }
            if (value.getOnExternalThreeDsContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalThreeDsContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalThreeDsContingency());
            }
            if (value.getOnExternalUserConsentForBankAccountInfoContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUserConsentForBankAccountInfoContingency());
            }
            if (value.getOnExternalBankAccountBalanceRequiredContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBankAccountBalanceRequiredContingency());
            }
            if (value.getOnExternalUnknownContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUnknownContingency());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalPreAuthorizationRequiredContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPreAuthorizationRequiredContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPreAuthorizationRequiredContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPreAuthorizationRequiredContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalPreAuthorizationRequiredContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPreAuthorizationRequiredContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPreAuthorizationRequiredContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPreAuthorizationRequiredContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "id", "authorizedAmount", "type"});
        public static final int $stable = 8;

        private OnExternalPreAuthorizationRequiredContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPreAuthorizationRequiredContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AuthorizedAmount authorizedAmount = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalPreAuthorizationRequiredType externalPreAuthorizationRequiredType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    authorizedAmount = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AuthorizedAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AuthorizedAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    externalPreAuthorizationRequiredType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalPreAuthorizationRequiredType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalContingencyName == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "name");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                throw new kotlin.KotlinNothingValueException();
            }
            if (authorizedAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "authorizedAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (externalPreAuthorizationRequiredType != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPreAuthorizationRequiredContingency(externalContingencyName, str, authorizedAmount, externalPreAuthorizationRequiredType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "type");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPreAuthorizationRequiredContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("authorizedAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AuthorizedAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAuthorizedAmount());
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalPreAuthorizationRequiredType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$AuthorizedAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$AuthorizedAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$AuthorizedAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$AuthorizedAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AuthorizedAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AuthorizedAmount> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AuthorizedAmount INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AuthorizedAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AuthorizedAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AuthorizedAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFields fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AuthorizedAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AuthorizedAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingSelectionMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalThreeDsContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalThreeDsContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalThreeDsContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalThreeDsContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalThreeDsContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalThreeDsContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalThreeDsContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalThreeDsContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalThreeDsContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalThreeDsContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalThreeDsContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalThreeDsContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalUserConsentForBankAccountInfoContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUserConsentForBankAccountInfoContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUserConsentForBankAccountInfoContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUserConsentForBankAccountInfoContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUserConsentForBankAccountInfoContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUserConsentForBankAccountInfoContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUserConsentForBankAccountInfoContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalUserConsentForBankAccountInfoContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUserConsentForBankAccountInfoContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUserConsentForBankAccountInfoContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUserConsentForBankAccountInfoContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalBankAccountBalanceRequiredContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankAccountBalanceRequiredContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankAccountBalanceRequiredContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankAccountBalanceRequiredContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBankAccountBalanceRequiredContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankAccountBalanceRequiredContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankAccountBalanceRequiredContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalBankAccountBalanceRequiredContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankAccountBalanceRequiredContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankAccountBalanceRequiredContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankAccountBalanceRequiredContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalUnknownContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUnknownContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUnknownContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUnknownContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUnknownContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("downstreamContingencyType");
        public static final int $stable = 8;

        private OnExternalUnknownContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "downstreamContingencyType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("downstreamContingencyType");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDownstreamContingencyType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalBalanceFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBalanceFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBalanceFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBalanceFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBalanceFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBalanceFundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBalanceFundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBalanceFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"availableAmount", "backupInstrumentId", "currency"});
        public static final int $stable = 8;

        private OnExternalBalanceFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBalanceFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AvailableAmount availableAmount = null;
            java.lang.Object obj = null;
            java.lang.String str = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    availableAmount = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AvailableAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AvailableAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (availableAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "availableAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBalanceFundingInstrument(availableAmount, str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currency");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBalanceFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("availableAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AvailableAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getAvailableAmount());
            writer.name("backupInstrumentId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBackupInstrumentId());
            writer.name("currency");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrency());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$AvailableAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$AvailableAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$AvailableAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$AvailableAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AvailableAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AvailableAmount> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AvailableAmount INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.AvailableAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private AvailableAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AvailableAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFields fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AvailableAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.AvailableAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingSelectionMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalBankFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBankFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"bs", "lastDigits", "backupInstrumentId"});
        public static final int $stable = 8;

        private OnExternalBankFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankSubType externalBankSubType = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalBankSubType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBankSubType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalBankSubType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "bs");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrument(externalBankSubType, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "lastDigits");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("bs");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBankSubType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getBs());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
            writer.name("backupInstrumentId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getBackupInstrumentId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalCardFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCardFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCardFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCardFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalCardFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"cs", "cardBrand", "lastDigits", "rewardId"});
        public static final int $stable = 8;

        private OnExternalCardFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType externalCardSubType = null;
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalCardSubType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardSubType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    externalCardBrand = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardBrand_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else if (selectName == 2) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 3) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (externalCardSubType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "cs");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument(externalCardSubType, externalCardBrand, str, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "lastDigits");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("cs");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardSubType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCs());
            writer.name("cardBrand");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardBrand_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getCardBrand());
            writer.name("lastDigits");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getLastDigits());
            writer.name("rewardId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getRewardId());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalPayPalCreditFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPayPalCreditFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPayPalCreditFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPayPalCreditFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalPayPalCreditFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalCreditFundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalCreditFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("creditOffer");
        public static final int $stable = 8;

        private OnExternalPayPalCreditFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer creditOffer = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                creditOffer = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
            }
            if (creditOffer != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument(creditOffer);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "creditOffer");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalCreditFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("creditOffer");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCreditOffer());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$CreditOffer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditOffer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditOffer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditOffer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditOffer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "category", "text1", "text2", "productType", "type", "termLink", "termLinkText", "creditAmount"});
        public static final int $stable = 8;

        private CreditOffer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            if (r9 == null) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            if (r10 == null) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer(r2, r3, r4, r5, r6, r7, r8, r9, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0088, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "creditAmount");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0093, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "termLinkText");
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x009d, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "termLink");
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "type");
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b3, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b4, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "productType");
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00be, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "category");
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r12, "id");
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001b, code lost:
        
            if (r2 == null) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001d, code lost:
        
            if (r3 == null) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        
            if (r6 == null) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
        
            if (r7 == null) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        
            if (r8 == null) goto L27;
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferCategory externalCreditOfferCategory = null;
            java.lang.String str2 = null;
            java.lang.String str3 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditProductType externalCreditProductType = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType = null;
            java.lang.String str4 = null;
            java.lang.String str5 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount creditAmount = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        externalCreditOfferCategory = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        externalCreditProductType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditProductType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        externalCreditOfferType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str5 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        creditAmount = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("category");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("text1");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getText1());
            writer.name("text2");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getText2());
            writer.name("productType");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditProductType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getProductType());
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("termLink");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTermLink());
            writer.name("termLinkText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTermLinkText());
            writer.name("creditAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getCreditAmount());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$CreditAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private CreditAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFields fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingSelectionMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalPayPalRewardsFundingInstrument;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPayPalRewardsFundingInstrument;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPayPalRewardsFundingInstrument;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalPayPalRewardsFundingInstrument;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalPayPalRewardsFundingInstrument implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalRewardsFundingInstrument> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalRewardsFundingInstrument INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalPayPalRewardsFundingInstrument();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"rewardsBalance", "allowedPrimaries"});
        public static final int $stable = 8;

        private OnExternalPayPalRewardsFundingInstrument() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalRewardsFundingInstrument fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.RewardsBalance rewardsBalance = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    rewardsBalance = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.RewardsBalance) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.RewardsBalance.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                }
            }
            if (rewardsBalance == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "rewardsBalance");
                throw new kotlin.KotlinNothingValueException();
            }
            if (list != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalRewardsFundingInstrument(rewardsBalance, list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "allowedPrimaries");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalPayPalRewardsFundingInstrument value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("rewardsBalance");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.RewardsBalance.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getRewardsBalance());
            writer.name("allowedPrimaries");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getAllowedPrimaries());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$RewardsBalance;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$RewardsBalance;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$RewardsBalance;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$RewardsBalance;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class RewardsBalance implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.RewardsBalance> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.RewardsBalance INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.RewardsBalance();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"denominationValue", "targetCurrencyAmount", "conversionFactor"});
        public static final int $stable = 8;

        private RewardsBalance() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.RewardsBalance fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TargetCurrencyAmount targetCurrencyAmount = null;
            java.lang.String str2 = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    targetCurrencyAmount = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TargetCurrencyAmount) com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TargetCurrencyAmount.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    str2 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "denominationValue");
                throw new kotlin.KotlinNothingValueException();
            }
            if (targetCurrencyAmount == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "targetCurrencyAmount");
                throw new kotlin.KotlinNothingValueException();
            }
            if (str2 != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.RewardsBalance(str, targetCurrencyAmount, str2);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "conversionFactor");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.RewardsBalance value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("denominationValue");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDenominationValue());
            writer.name("targetCurrencyAmount");
            com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TargetCurrencyAmount.INSTANCE, true).toJson(writer, customScalarAdapters, value.getTargetCurrencyAmount());
            writer.name("conversionFactor");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getConversionFactor());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$TargetCurrencyAmount;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TargetCurrencyAmount;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TargetCurrencyAmount;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TargetCurrencyAmount;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TargetCurrencyAmount implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TargetCurrencyAmount> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TargetCurrencyAmount INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TargetCurrencyAmount();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TargetCurrencyAmount() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TargetCurrencyAmount fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            reader.rewind();
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFields fromJson = com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.fromJson(reader, customScalarAdapters);
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TargetCurrencyAmount(str, fromJson);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "__typename");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TargetCurrencyAmount value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.fragment.FundingSelectionMoneyFieldsImpl_ResponseAdapter.FundingSelectionMoneyFields.INSTANCE.toJson(writer, customScalarAdapters, value.getFundingSelectionMoneyFields());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$Config;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Config;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Config;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Config;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Config implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Config INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Config();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"selectedInstrumentIds", "mustUseInstrumentIds", "preferredInstrumentId", "recommendedInstrumentId", "balanceEligibility", "balanceSelected", "balanceSubType", "instrumentConstraints"});
        public static final int $stable = 8;

        private Config() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "instrumentConstraints");
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0093, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0094, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "mustUseInstrumentIds");
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x009e, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x009f, code lost:
        
            com.apollographql.apollo.api.Assertions.missingField(r11, "selectedInstrumentIds");
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00a9, code lost:
        
            throw new kotlin.KotlinNothingValueException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        
            if (r2 == null) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
        
            if (r3 == null) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        
            if (r9 == null) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
        
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config(r2, r3, r4, r5, r6, r7, r8, r9);
         */
        @Override // com.apollographql.apollo.api.Adapter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            java.util.List list2 = null;
            java.lang.String str = null;
            java.lang.String str2 = null;
            java.lang.Boolean bool = null;
            java.lang.Boolean bool2 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBalanceSubType externalBalanceSubType = null;
            java.util.List list3 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        list2 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool2 = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        externalBalanceSubType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBalanceSubType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBalanceSubType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        list3 = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentConstraint.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                        break;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Config value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("selectedInstrumentIds");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getSelectedInstrumentIds());
            writer.name("mustUseInstrumentIds");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.StringAdapter).toJson(writer, customScalarAdapters, (java.util.List) value.getMustUseInstrumentIds());
            writer.name("preferredInstrumentId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getPreferredInstrumentId());
            writer.name("recommendedInstrumentId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getRecommendedInstrumentId());
            writer.name("balanceEligibility");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getBalanceEligibility());
            writer.name("balanceSelected");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getBalanceSelected());
            writer.name("balanceSubType");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBalanceSubType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getBalanceSubType());
            writer.name("instrumentConstraints");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9939obj(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentConstraint.INSTANCE, true)).toJson(writer, customScalarAdapters, (java.util.List) value.getInstrumentConstraints());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$InstrumentConstraint;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentConstraint;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentConstraint;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$InstrumentConstraint;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class InstrumentConstraint implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentConstraint> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentConstraint INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.InstrumentConstraint();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private InstrumentConstraint() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentConstraint fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrumentDisallowed onExternalBankFundingInstrumentDisallowed;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrumentDisallowed onExternalCardFundingInstrumentDisallowed = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalBankFundingInstrumentDisallowed"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalBankFundingInstrumentDisallowed = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrumentDisallowed.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalBankFundingInstrumentDisallowed = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalCardFundingInstrumentDisallowed"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalCardFundingInstrumentDisallowed = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrumentDisallowed.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentConstraint(str, onExternalBankFundingInstrumentDisallowed, onExternalCardFundingInstrumentDisallowed);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.InstrumentConstraint value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalBankFundingInstrumentDisallowed() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrumentDisallowed.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalBankFundingInstrumentDisallowed());
            }
            if (value.getOnExternalCardFundingInstrumentDisallowed() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrumentDisallowed.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalCardFundingInstrumentDisallowed());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalBankFundingInstrumentDisallowed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankFundingInstrumentDisallowed;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankFundingInstrumentDisallowed;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalBankFundingInstrumentDisallowed;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalBankFundingInstrumentDisallowed implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrumentDisallowed> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrumentDisallowed INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalBankFundingInstrumentDisallowed();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"allAccountTypes", "disallowedAccountTypes", "type"});
        public static final int $stable = 8;

        private OnExternalBankFundingInstrumentDisallowed() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrumentDisallowed fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            java.util.List list = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedAccountType.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    externalFundingInstrumentType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (list == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "disallowedAccountTypes");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (externalFundingInstrumentType != null) {
                    return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrumentDisallowed(booleanValue, list, externalFundingInstrumentType);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "allAccountTypes");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalBankFundingInstrumentDisallowed value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("allAccountTypes");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getAllAccountTypes()));
            writer.name("disallowedAccountTypes");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedAccountType.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getDisallowedAccountTypes());
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$DisallowedAccountType;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedAccountType;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedAccountType;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedAccountType;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisallowedAccountType implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedAccountType> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedAccountType INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedAccountType();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("accountType");
        public static final int $stable = 8;

        private DisallowedAccountType() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedAccountType fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalBankAccountType externalBankAccountType = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalBankAccountType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBankAccountType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalBankAccountType != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedAccountType(externalBankAccountType);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "accountType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedAccountType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("accountType");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalBankAccountType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getAccountType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalCardFundingInstrumentDisallowed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCardFundingInstrumentDisallowed;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCardFundingInstrumentDisallowed;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalCardFundingInstrumentDisallowed;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalCardFundingInstrumentDisallowed implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrumentDisallowed> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrumentDisallowed INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalCardFundingInstrumentDisallowed();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"allSubTypes", "disallowedSubTypes", "type"});
        public static final int $stable = 8;

        private OnExternalCardFundingInstrumentDisallowed() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrumentDisallowed fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.Boolean bool = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingInstrumentType externalFundingInstrumentType = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    list = (java.util.List) com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedSubType.INSTANCE, false, 1, null))).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    externalFundingInstrumentType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                }
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (externalFundingInstrumentType != null) {
                    return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrumentDisallowed(booleanValue, list, externalFundingInstrumentType);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "allSubTypes");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalCardFundingInstrumentDisallowed value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("allSubTypes");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getAllSubTypes()));
            writer.name("disallowedSubTypes");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedSubType.INSTANCE, false, 1, null))).toJson(writer, customScalarAdapters, value.getDisallowedSubTypes());
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingInstrumentType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$DisallowedSubType;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedSubType;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedSubType;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedSubType;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisallowedSubType implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedSubType> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedSubType INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedSubType();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"subType", "allBrands", "disallowedBrands"});
        public static final int $stable = 8;

        private DisallowedSubType() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedSubType fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardSubType externalCardSubType = null;
            java.lang.Boolean bool = null;
            java.util.List list = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalCardSubType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardSubType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                } else if (selectName == 1) {
                    bool = com.apollographql.apollo.api.Adapters.BooleanAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 2) {
                        break;
                    }
                    list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedBrand.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
                }
            }
            if (externalCardSubType == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, "subType");
                throw new kotlin.KotlinNothingValueException();
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                if (list != null) {
                    return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedSubType(externalCardSubType, booleanValue, list);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "disallowedBrands");
                throw new kotlin.KotlinNothingValueException();
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "allBrands");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedSubType value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("subType");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardSubType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getSubType());
            writer.name("allBrands");
            com.apollographql.apollo.api.Adapters.BooleanAdapter.toJson(writer, customScalarAdapters, java.lang.Boolean.valueOf(value.getAllBrands()));
            writer.name("disallowedBrands");
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedBrand.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getDisallowedBrands());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$DisallowedBrand;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedBrand;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedBrand;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$DisallowedBrand;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DisallowedBrand implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedBrand> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedBrand INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.DisallowedBrand();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("brand");
        public static final int $stable = 8;

        private DisallowedBrand() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedBrand fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCardBrand externalCardBrand = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalCardBrand = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardBrand_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalCardBrand != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedBrand(externalCardBrand);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "brand");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.DisallowedBrand value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("brand");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCardBrand_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getBrand());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$TransactionLevelContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TransactionLevelContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TransactionLevelContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$TransactionLevelContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TransactionLevelContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TransactionLevelContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.TransactionLevelContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("__typename");
        public static final int $stable = 8;

        private TransactionLevelContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAddCardContingency onExternalAddCardContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUpdateCardContingency onExternalUpdateCardContingency;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency1 onExternalContingency1;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAuthChallengeContingency onExternalAuthChallengeContingency;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency1 onExternalUnknownContingency1 = null;
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new java.lang.IllegalStateException("__typename was not found".toString());
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalAddCardContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalAddCardContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAddCardContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalAddCardContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUpdateCardContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUpdateCardContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUpdateCardContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalUpdateCardContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalPhoneNumberRequiredContingency", "externalEConsentContingency", "externalCardVerificationValueContingency", "externalThreeDsContingency", "externalUserConsentForBankAccountInfoContingency", "externalBankAccountBalanceRequiredContingency", "externalPreAuthorizationRequiredContingency", "externalDataCollectionContingency", "externalUnknownContingency", "externalPreAuthorizationRequiredDeclinedRetryableContingency", "externalSepaContingency", "externalCardExpiringSoonContingency", "externalAddCardContingency", "externalUpdateCardContingency", "externalAuthChallengeContingency", "externalNegativeBalanceRecoveryContingency", "externalStrongCustomerAuthContingency", "externalDomesticShippingContingency", "externalShippingAddressRequiredContingency", "externalShippingAddressInvalidContingency", "externalReselectFundingInstrumentContingency", "externalCitAuthContingency", "externalPreAuthorizationDeclinedContingency", "externalInventorySoldoutContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalContingency1 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency1.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalContingency1 = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalAuthChallengeContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalAuthChallengeContingency = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAuthChallengeContingency.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onExternalAuthChallengeContingency = null;
            }
            if (com.apollographql.apollo.api.BooleanExpressions.evaluate(com.apollographql.apollo.api.BooleanExpressions.possibleTypes("externalUnknownContingency"), customScalarAdapters.falseVariables, str, customScalarAdapters.deferredFragmentIdentifiers, null)) {
                reader.rewind();
                onExternalUnknownContingency1 = com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency(str, onExternalAddCardContingency, onExternalUpdateCardContingency, onExternalContingency1, onExternalAuthChallengeContingency, onExternalUnknownContingency1);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.TransactionLevelContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("__typename");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnExternalAddCardContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAddCardContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalAddCardContingency());
            }
            if (value.getOnExternalUpdateCardContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUpdateCardContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUpdateCardContingency());
            }
            if (value.getOnExternalContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalContingency());
            }
            if (value.getOnExternalAuthChallengeContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAuthChallengeContingency.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalAuthChallengeContingency());
            }
            if (value.getOnExternalUnknownContingency() != null) {
                com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnExternalUnknownContingency());
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalAddCardContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalAddCardContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalAddCardContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalAddCardContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalAddCardContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAddCardContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAddCardContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAddCardContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalAddCardContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAddCardContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAddCardContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAddCardContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalUpdateCardContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUpdateCardContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUpdateCardContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUpdateCardContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUpdateCardContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUpdateCardContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUpdateCardContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUpdateCardContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalUpdateCardContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUpdateCardContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUpdateCardContingency(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUpdateCardContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalContingency1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalContingency1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalContingency1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalContingency1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalContingency1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency1> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency1 INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalContingency1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private OnExternalContingency1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalContingencyName externalContingencyName = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalContingencyName = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalContingencyName != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency1(externalContingencyName);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalContingency1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalAuthChallengeContingency;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalAuthChallengeContingency;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalAuthChallengeContingency;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalAuthChallengeContingency;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalAuthChallengeContingency implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAuthChallengeContingency> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAuthChallengeContingency INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalAuthChallengeContingency();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"name", "stepUpAuthID"});
        public static final int $stable = 8;

        private OnExternalAuthChallengeContingency() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAuthChallengeContingency fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
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
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAuthChallengeContingency(externalContingencyName, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "stepUpAuthID");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalAuthChallengeContingency value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalContingencyName_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
            writer.name("stepUpAuthID");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getStepUpAuthID());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalUnknownContingency1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUnknownContingency1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUnknownContingency1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalUnknownContingency1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalUnknownContingency1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency1> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency1 INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalUnknownContingency1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("downstreamContingencyType");
        public static final int $stable = 8;

        private OnExternalUnknownContingency1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency1(str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "downstreamContingencyType");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalUnknownContingency1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("downstreamContingencyType");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getDownstreamContingencyType());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$Disclaimer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Disclaimer;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Disclaimer;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Disclaimer;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Disclaimer implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Disclaimer> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Disclaimer INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Disclaimer();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"type", "text"});
        public static final int $stable = 8;

        private Disclaimer() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Disclaimer fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionDisclaimerType externalFundingSelectionDisclaimerType = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    externalFundingSelectionDisclaimerType = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionDisclaimerType) com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingSelectionDisclaimerType_ResponseAdapter.INSTANCE).fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Disclaimer(externalFundingSelectionDisclaimerType, str);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "text");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Disclaimer value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("type");
            com.apollographql.apollo.api.Adapters.m9938nullable(com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingSelectionDisclaimerType_ResponseAdapter.INSTANCE).toJson(writer, customScalarAdapters, value.getType());
            writer.name("text");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getText());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$CreditOffer1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditOffer1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditOffer1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditOffer1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditOffer1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer1> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer1 INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditOffer1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"id", "category", "text1", "text2", "termLink", "termLinkText", "type", "productIdentifier", "productType", "heading", "incentiveProgramCode", "incentiveValue", "incentiveProgramId", "creditAmount", "crossCurrencyTransaction", "currencyConversionRate", "imageUrl"});
        public static final int $stable = 8;

        private CreditOffer1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0029. Please report as an issue. */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            java.lang.String str;
            java.lang.String str2;
            java.lang.String str3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str4 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferCategory externalCreditOfferCategory = null;
            java.lang.String str5 = null;
            java.lang.String str6 = null;
            java.lang.String str7 = null;
            java.lang.String str8 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditOfferType externalCreditOfferType = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditProductIdentifier externalCreditProductIdentifier = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalCreditProductType externalCreditProductType = null;
            java.lang.String str9 = null;
            java.lang.String str10 = null;
            java.lang.String str11 = null;
            java.lang.String str12 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount1 creditAmount1 = null;
            java.lang.Boolean bool = null;
            java.lang.String str13 = null;
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl1 imageUrl1 = null;
            while (true) {
                switch (reader.selectName(RESPONSE_NAMES)) {
                    case 0:
                        str3 = str11;
                        str4 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 1:
                        str3 = str11;
                        externalCreditOfferCategory = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferCategory_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 2:
                        str3 = str11;
                        str5 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 3:
                        str3 = str11;
                        str6 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 4:
                        str3 = str11;
                        str7 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 5:
                        str3 = str11;
                        str8 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 6:
                        str3 = str11;
                        externalCreditOfferType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 7:
                        str3 = str11;
                        externalCreditProductIdentifier = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditProductIdentifier_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 8:
                        str3 = str11;
                        externalCreditProductType = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditProductType_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 9:
                        str3 = str11;
                        str9 = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 10:
                        str3 = str11;
                        str10 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 11:
                        str11 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                    case 12:
                        str3 = str11;
                        str12 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                        str11 = str3;
                    case 13:
                        str = str10;
                        str2 = str11;
                        creditAmount1 = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount1) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount1.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        str11 = str2;
                        str10 = str;
                    case 14:
                        bool = com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.fromJson(reader, customScalarAdapters);
                    case 15:
                        str13 = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
                    case 16:
                        str = str10;
                        str2 = str11;
                        imageUrl1 = (com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl1) com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl1.INSTANCE, false, 1, null).fromJson(reader, customScalarAdapters);
                        str11 = str2;
                        str10 = str;
                }
                java.lang.String str14 = str10;
                java.lang.String str15 = str11;
                if (str4 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "id");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (externalCreditOfferCategory == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "category");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (str7 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "termLink");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (str8 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "termLinkText");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (externalCreditOfferType == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "type");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (externalCreditProductIdentifier == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "productIdentifier");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (externalCreditProductType == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "productType");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (str9 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "heading");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (creditAmount1 == null) {
                    com.apollographql.apollo.api.Assertions.missingField(reader, "creditAmount");
                    throw new kotlin.KotlinNothingValueException();
                }
                if (imageUrl1 != null) {
                    return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer1(str4, externalCreditOfferCategory, str5, str6, str7, str8, externalCreditOfferType, externalCreditProductIdentifier, externalCreditProductType, str9, str14, str15, str12, creditAmount1, bool, str13, imageUrl1);
                }
                com.apollographql.apollo.api.Assertions.missingField(reader, "imageUrl");
                throw new kotlin.KotlinNothingValueException();
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditOffer1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("id");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getId());
            writer.name("category");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferCategory_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getCategory());
            writer.name("text1");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getText1());
            writer.name("text2");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getText2());
            writer.name("termLink");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTermLink());
            writer.name("termLinkText");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getTermLinkText());
            writer.name("type");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditOfferType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getType());
            writer.name("productIdentifier");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditProductIdentifier_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getProductIdentifier());
            writer.name("productType");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalCreditProductType_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getProductType());
            writer.name("heading");
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getHeading());
            writer.name("incentiveProgramCode");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIncentiveProgramCode());
            writer.name("incentiveValue");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIncentiveValue());
            writer.name("incentiveProgramId");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getIncentiveProgramId());
            writer.name("creditAmount");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount1.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getCreditAmount());
            writer.name("crossCurrencyTransaction");
            com.apollographql.apollo.api.Adapters.NullableBooleanAdapter.toJson(writer, customScalarAdapters, value.getCrossCurrencyTransaction());
            writer.name("currencyConversionRate");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getCurrencyConversionRate());
            writer.name("imageUrl");
            com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl1.INSTANCE, false, 1, null).toJson(writer, customScalarAdapters, value.getImageUrl());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$CreditAmount1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditAmount1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditAmount1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$CreditAmount1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class CreditAmount1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount1> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount1 INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.CreditAmount1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "currencyCode"});
        public static final int $stable = 8;

        private CreditAmount1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            java.lang.Object obj = null;
            while (true) {
                int selectName = reader.selectName(RESPONSE_NAMES);
                if (selectName == 0) {
                    str = com.apollographql.apollo.api.Adapters.StringAdapter.fromJson(reader, customScalarAdapters);
                } else {
                    if (selectName != 1) {
                        break;
                    }
                    obj = com.apollographql.apollo.api.Adapters.AnyAdapter.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
                throw new kotlin.KotlinNothingValueException();
            }
            if (obj != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount1(str, obj);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "currencyCode");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.CreditAmount1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            com.apollographql.apollo.api.Adapters.StringAdapter.toJson(writer, customScalarAdapters, value.getValue());
            writer.name("currencyCode");
            com.apollographql.apollo.api.Adapters.AnyAdapter.toJson(writer, customScalarAdapters, value.getCurrencyCode());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$ImageUrl1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ImageUrl1;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ImageUrl1;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$ImageUrl1;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ImageUrl1 implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl1> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl1 INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.ImageUrl1();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("imagePath");
        public static final int $stable = 8;

        private ImageUrl1() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl1 fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.lang.String str = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                str = com.apollographql.apollo.api.Adapters.NullableStringAdapter.fromJson(reader, customScalarAdapters);
            }
            return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl1(str);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.ImageUrl1 value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("imagePath");
            com.apollographql.apollo.api.Adapters.NullableStringAdapter.toJson(writer, customScalarAdapters, value.getImagePath());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$StaleDomain;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$StaleDomain;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$StaleDomain;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$StaleDomain;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class StaleDomain implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.StaleDomain> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.StaleDomain INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.StaleDomain();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("domain");
        public static final int $stable = 8;

        private StaleDomain() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.StaleDomain fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalDomain externalDomain = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalDomain = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalDomain_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalDomain != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.StaleDomain(externalDomain);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "domain");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.StaleDomain value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("domain");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalDomain_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getDomain());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$OnExternalFundingSelectionErrorResponse;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingSelectionErrorResponse;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingSelectionErrorResponse;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$OnExternalFundingSelectionErrorResponse;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class OnExternalFundingSelectionErrorResponse implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionErrorResponse> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionErrorResponse INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.OnExternalFundingSelectionErrorResponse();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
        public static final int $stable = 8;

        private OnExternalFundingSelectionErrorResponse() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionErrorResponse fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            java.util.List list = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                list = com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Error.INSTANCE, false, 1, null)).fromJson(reader, customScalarAdapters);
            }
            if (list != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionErrorResponse(list);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.OnExternalFundingSelectionErrorResponse value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ERRORS_KEY);
            com.apollographql.apollo.api.Adapters.m9937list(com.apollographql.apollo.api.Adapters.m9940obj$default(com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Error.INSTANCE, false, 1, null)).toJson(writer, customScalarAdapters, (java.util.List) value.getErrors());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/adapter/FundingSelectionQuery_ResponseAdapter$Error;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Error;", "<init>", "()V", "Lcom/apollographql/apollo/api/json/JsonReader;", "reader", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "customScalarAdapters", "fromJson", "(Lcom/apollographql/apollo/api/json/JsonReader;Lcom/apollographql/apollo/api/CustomScalarAdapters;)Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Error;", "Lcom/apollographql/apollo/api/json/JsonWriter;", "writer", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "toJson", "(Lcom/apollographql/apollo/api/json/JsonWriter;Lcom/apollographql/apollo/api/CustomScalarAdapters;Lcom/paypal/oslo/feature/inappcheckout/graphql/checkout/FundingSelectionQuery$Error;)V", "", "", "RESPONSE_NAMES", "Ljava/util/List;", "getRESPONSE_NAMES", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Error implements com.apollographql.apollo.api.Adapter<com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error> {
        public static final com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Error INSTANCE = new com.paypal.oslo.feature.inappcheckout.graphql.checkout.adapter.FundingSelectionQuery_ResponseAdapter.Error();
        private static final java.util.List<java.lang.String> RESPONSE_NAMES = kotlin.collections.CollectionsKt.listOf("name");
        public static final int $stable = 8;

        private Error() {
        }

        public final java.util.List<java.lang.String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.apollographql.apollo.api.Adapter
        public final com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error fromJson(com.apollographql.apollo.api.json.JsonReader reader, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reader, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.ExternalFundingSelectionErrorReason externalFundingSelectionErrorReason = null;
            while (reader.selectName(RESPONSE_NAMES) == 0) {
                externalFundingSelectionErrorReason = com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingSelectionErrorReason_ResponseAdapter.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            if (externalFundingSelectionErrorReason != null) {
                return new com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error(externalFundingSelectionErrorReason);
            }
            com.apollographql.apollo.api.Assertions.missingField(reader, "name");
            throw new kotlin.KotlinNothingValueException();
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(com.apollographql.apollo.api.json.JsonWriter writer, com.apollographql.apollo.api.CustomScalarAdapters customScalarAdapters, com.paypal.oslo.feature.inappcheckout.graphql.checkout.FundingSelectionQuery.Error value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writer, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customScalarAdapters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
            writer.name("name");
            com.paypal.oslo.feature.inappcheckout.graphql.checkout.type.adapter.ExternalFundingSelectionErrorReason_ResponseAdapter.INSTANCE.toJson(writer, customScalarAdapters, value.getName());
        }
    }
}
